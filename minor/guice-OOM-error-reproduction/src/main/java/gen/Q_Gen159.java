
  package gen;
  public class Q_Gen159 {
  		@com.google.inject.Inject
  		public Q_Gen159(Q_Gen160 q_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  