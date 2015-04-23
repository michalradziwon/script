
  package gen;
  public class B_Gen188 {
  		@com.google.inject.Inject
  		public B_Gen188(B_Gen189 b_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  