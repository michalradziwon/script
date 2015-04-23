
  package gen;
  public class T_Gen110 {
  		@com.google.inject.Inject
  		public T_Gen110(T_Gen111 t_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  