
  package gen;
  public class B_Gen40 {
  		@com.google.inject.Inject
  		public B_Gen40(B_Gen41 b_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  