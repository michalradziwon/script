
  package gen;
  public class B_Gen179 {
  		@com.google.inject.Inject
  		public B_Gen179(B_Gen180 b_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  