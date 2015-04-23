
  package gen;
  public class B_Gen20 {
  		@com.google.inject.Inject
  		public B_Gen20(B_Gen21 b_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  