
  package gen;
  public class Q_Gen68 {
  		@com.google.inject.Inject
  		public Q_Gen68(Q_Gen69 q_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  