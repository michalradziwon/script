
  package gen;
  public class B_Gen153 {
  		@com.google.inject.Inject
  		public B_Gen153(B_Gen154 b_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  