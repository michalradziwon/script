
  package gen;
  public class B_Gen139 {
  		@com.google.inject.Inject
  		public B_Gen139(B_Gen140 b_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  