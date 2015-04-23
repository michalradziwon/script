
  package gen;
  public class F_Gen153 {
  		@com.google.inject.Inject
  		public F_Gen153(F_Gen154 f_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  