
  package gen;
  public class Q_Gen152 {
  		@com.google.inject.Inject
  		public Q_Gen152(Q_Gen153 q_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  