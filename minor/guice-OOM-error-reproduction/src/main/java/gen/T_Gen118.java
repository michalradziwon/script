
  package gen;
  public class T_Gen118 {
  		@com.google.inject.Inject
  		public T_Gen118(T_Gen119 t_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  