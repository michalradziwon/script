
  package gen;
  public class T_Gen160 {
  		@com.google.inject.Inject
  		public T_Gen160(T_Gen161 t_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  