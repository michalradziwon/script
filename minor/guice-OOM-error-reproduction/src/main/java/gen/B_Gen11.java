
  package gen;
  public class B_Gen11 {
  		@com.google.inject.Inject
  		public B_Gen11(B_Gen12 b_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  