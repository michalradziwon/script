
  package gen;
  public class B_Gen115 {
  		@com.google.inject.Inject
  		public B_Gen115(B_Gen116 b_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  