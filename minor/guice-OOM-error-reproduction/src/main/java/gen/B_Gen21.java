
  package gen;
  public class B_Gen21 {
  		@com.google.inject.Inject
  		public B_Gen21(B_Gen22 b_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  