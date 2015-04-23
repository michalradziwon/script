
  package gen;
  public class B_Gen80 {
  		@com.google.inject.Inject
  		public B_Gen80(B_Gen81 b_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  