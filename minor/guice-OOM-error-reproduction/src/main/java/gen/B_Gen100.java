
  package gen;
  public class B_Gen100 {
  		@com.google.inject.Inject
  		public B_Gen100(B_Gen101 b_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  