
  package gen;
  public class B_Gen170 {
  		@com.google.inject.Inject
  		public B_Gen170(B_Gen171 b_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  