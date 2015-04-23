
  package gen;
  public class B_Gen42 {
  		@com.google.inject.Inject
  		public B_Gen42(B_Gen43 b_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  