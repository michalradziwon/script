
  package gen;
  public class Q_Gen126 {
  		@com.google.inject.Inject
  		public Q_Gen126(Q_Gen127 q_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  