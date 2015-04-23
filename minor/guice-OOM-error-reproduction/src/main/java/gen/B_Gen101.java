
  package gen;
  public class B_Gen101 {
  		@com.google.inject.Inject
  		public B_Gen101(B_Gen102 b_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  