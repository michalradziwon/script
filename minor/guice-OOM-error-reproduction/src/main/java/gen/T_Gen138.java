
  package gen;
  public class T_Gen138 {
  		@com.google.inject.Inject
  		public T_Gen138(T_Gen139 t_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  