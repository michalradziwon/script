
  package gen;
  public class H_Gen63 {
  		@com.google.inject.Inject
  		public H_Gen63(H_Gen64 h_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  