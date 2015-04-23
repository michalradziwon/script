
  package gen;
  public class T_Gen93 {
  		@com.google.inject.Inject
  		public T_Gen93(T_Gen94 t_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  