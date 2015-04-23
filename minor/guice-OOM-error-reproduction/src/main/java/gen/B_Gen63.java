
  package gen;
  public class B_Gen63 {
  		@com.google.inject.Inject
  		public B_Gen63(B_Gen64 b_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  