
  package gen;
  public class B_Gen149 {
  		@com.google.inject.Inject
  		public B_Gen149(B_Gen150 b_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  