
  package gen;
  public class B_Gen97 {
  		@com.google.inject.Inject
  		public B_Gen97(B_Gen98 b_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  