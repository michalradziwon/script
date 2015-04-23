
  package gen;
  public class T_Gen141 {
  		@com.google.inject.Inject
  		public T_Gen141(T_Gen142 t_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  