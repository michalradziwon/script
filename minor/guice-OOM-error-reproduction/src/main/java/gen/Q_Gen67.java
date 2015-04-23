
  package gen;
  public class Q_Gen67 {
  		@com.google.inject.Inject
  		public Q_Gen67(Q_Gen68 q_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  