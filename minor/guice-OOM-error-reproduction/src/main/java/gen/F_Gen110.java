
  package gen;
  public class F_Gen110 {
  		@com.google.inject.Inject
  		public F_Gen110(F_Gen111 f_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  