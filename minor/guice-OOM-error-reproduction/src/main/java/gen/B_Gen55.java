
  package gen;
  public class B_Gen55 {
  		@com.google.inject.Inject
  		public B_Gen55(B_Gen56 b_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  