
  package gen;
  public class T_Gen85 {
  		@com.google.inject.Inject
  		public T_Gen85(T_Gen86 t_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  