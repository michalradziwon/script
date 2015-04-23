
  package gen;
  public class T_Gen182 {
  		@com.google.inject.Inject
  		public T_Gen182(T_Gen183 t_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  