
  package gen;
  public class B_Gen134 {
  		@com.google.inject.Inject
  		public B_Gen134(B_Gen135 b_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  