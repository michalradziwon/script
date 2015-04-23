
  package gen;
  public class B_Gen59 {
  		@com.google.inject.Inject
  		public B_Gen59(B_Gen60 b_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  