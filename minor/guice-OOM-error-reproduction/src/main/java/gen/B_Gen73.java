
  package gen;
  public class B_Gen73 {
  		@com.google.inject.Inject
  		public B_Gen73(B_Gen74 b_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  