
  package gen;
  public class Q_Gen134 {
  		@com.google.inject.Inject
  		public Q_Gen134(Q_Gen135 q_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  