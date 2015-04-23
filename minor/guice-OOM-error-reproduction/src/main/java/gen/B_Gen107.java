
  package gen;
  public class B_Gen107 {
  		@com.google.inject.Inject
  		public B_Gen107(B_Gen108 b_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  