
  package gen;
  public class B_Gen173 {
  		@com.google.inject.Inject
  		public B_Gen173(B_Gen174 b_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  