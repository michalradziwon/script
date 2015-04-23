
  package gen;
  public class B_Gen174 {
  		@com.google.inject.Inject
  		public B_Gen174(B_Gen175 b_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  