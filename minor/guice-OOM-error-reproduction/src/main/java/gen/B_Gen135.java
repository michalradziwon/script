
  package gen;
  public class B_Gen135 {
  		@com.google.inject.Inject
  		public B_Gen135(B_Gen136 b_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  