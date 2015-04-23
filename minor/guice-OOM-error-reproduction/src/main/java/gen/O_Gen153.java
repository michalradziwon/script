
  package gen;
  public class O_Gen153 {
  		@com.google.inject.Inject
  		public O_Gen153(O_Gen154 o_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  