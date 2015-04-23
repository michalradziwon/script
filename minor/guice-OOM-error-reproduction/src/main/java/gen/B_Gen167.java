
  package gen;
  public class B_Gen167 {
  		@com.google.inject.Inject
  		public B_Gen167(B_Gen168 b_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  