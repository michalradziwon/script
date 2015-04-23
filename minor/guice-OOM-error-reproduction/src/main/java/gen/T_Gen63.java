
  package gen;
  public class T_Gen63 {
  		@com.google.inject.Inject
  		public T_Gen63(T_Gen64 t_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  