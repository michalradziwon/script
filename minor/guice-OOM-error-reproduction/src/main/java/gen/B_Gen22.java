
  package gen;
  public class B_Gen22 {
  		@com.google.inject.Inject
  		public B_Gen22(B_Gen23 b_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  