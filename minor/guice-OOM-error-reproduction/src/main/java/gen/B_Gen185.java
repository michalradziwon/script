
  package gen;
  public class B_Gen185 {
  		@com.google.inject.Inject
  		public B_Gen185(B_Gen186 b_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  