
  package gen;
  public class B_Gen162 {
  		@com.google.inject.Inject
  		public B_Gen162(B_Gen163 b_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  