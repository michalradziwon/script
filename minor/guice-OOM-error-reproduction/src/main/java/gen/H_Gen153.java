
  package gen;
  public class H_Gen153 {
  		@com.google.inject.Inject
  		public H_Gen153(H_Gen154 h_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  