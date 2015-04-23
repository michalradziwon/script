
  package gen;
  public class T_Gen92 {
  		@com.google.inject.Inject
  		public T_Gen92(T_Gen93 t_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  