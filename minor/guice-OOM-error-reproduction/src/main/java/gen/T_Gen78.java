
  package gen;
  public class T_Gen78 {
  		@com.google.inject.Inject
  		public T_Gen78(T_Gen79 t_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  