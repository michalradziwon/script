
  package gen;
  public class T_Gen106 {
  		@com.google.inject.Inject
  		public T_Gen106(T_Gen107 t_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  