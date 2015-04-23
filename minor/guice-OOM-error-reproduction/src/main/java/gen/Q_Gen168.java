
  package gen;
  public class Q_Gen168 {
  		@com.google.inject.Inject
  		public Q_Gen168(Q_Gen169 q_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  