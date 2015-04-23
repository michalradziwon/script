
  package gen;
  public class Q_Gen153 {
  		@com.google.inject.Inject
  		public Q_Gen153(Q_Gen154 q_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  